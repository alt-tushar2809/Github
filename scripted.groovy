    node {  
      stage('Pull-Code') { 
        git 'https://github.com/atulyw/CBZ-B4.git' 
      }
      stage('Build') { 
        sh label: '', script: '''ls
                                pwd
                              '''
      }
      stage('Deploy') { 
        echo 'code deployed'
      }
    }