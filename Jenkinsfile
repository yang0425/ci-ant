stage('Checkout') {
    node {
        git url: 'https://github.com/yang0425/ci-ant.git'
        sh "ant -buildfile build.test.xml clean"
    }
}

stage('UnitTest') {
    node {
        sh "ant -buildfile build.test.xml test"
    }
}