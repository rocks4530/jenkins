
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'gradle clean build'
            }
        }
        stage('Test') {
            steps {
               	withSonarQubeEnv('localSonar') {
                	sh 'gradle sonarqube'
              	}    
            }
        }
        stage('Quality Gate') {
            steps {
            	timeout(time: 2, unit: 'MINUTES') {
                	waitForQualityGate abortPipeline: true
            	}
            }
        }
        /*
        stage('deploy') {
            steps {
                pushToCloudFoundry(
  					target: 'api.cf.sap.hana.ondemand.com',
  					organization: 'CloudIntegrationGateway_CIG-DEV',
  					cloudSpace: 'Development',
  					credentialsId: 'cf'
				)
            }
        }
        */

    }
}