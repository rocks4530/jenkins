
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
               	withSonarQubeEnv('My SonarQube Server') {
                	sh 'gradle sonarqube'
              	}    
            }
        }
        stage('Quality Gate') {
            steps {
                waitForQualityGate abortPipeline: true
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