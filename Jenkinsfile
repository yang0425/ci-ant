stage('Checkout') {
    node {
        git url: 'https://github.com/yang0425/ci-ant.git'
        ant -buildfile build.test.xml clean
    }
}

stage('UnitTest') {
    node {
        ant -buildfile build.test.xml test
    }
}