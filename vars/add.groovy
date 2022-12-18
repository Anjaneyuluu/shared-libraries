def call(' string defaultValue:,description:,name:'){
  parameters {
        string defaultValue: '11', description: 'Enter number one', name: 'varOne'
        string defaultValue: '22', description: 'Enter number Two', name: 'varTwo'
    }
    stages {
        stage("Add Two Numbers") {
            steps {
                script {
                    def varOne = params.varOne as int
                    def varTwo = params.varTwo as int
                    def result = varOne + varTwo
                    echo "result is ${result}"
                }
            }
        }
    }
}
