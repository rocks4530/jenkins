
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh 'gradle clean build'
            }
        }
        stage('test') {
            steps {
                sh 'gradle test'
                sh 'gradle sonarqube'
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