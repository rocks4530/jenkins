
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                gradle {
                	tasks('clean')
            		tasks('build')
            		switches('--info')
        		}
            }
        }
        

    }
}