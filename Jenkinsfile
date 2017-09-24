node {
    env.JAVA_HOME="${tool 'jdk1.6'}"
    env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"

    stage 'version'
    sh "java -version"

    stage 'UnitTest'
    sh "ant -buildfile build.test.xml test"
}