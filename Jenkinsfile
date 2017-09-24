node {
    env.JAVA_HOME="${tool 'jdk1.6'}"
    env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"

    stage 'CheckOut'
    sh "java -version"
    checkout scm

    stage 'UnitTest'
    sh "ant -buildfile build.test.xml test"
    junit 'report/TEST-*.xml'
}