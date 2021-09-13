def call(String options = 'test') {
  sh "/opt/gradle/gradle-6.4.1/bin/gradle ${options}"
}
def call(String options = 'build'){
sh "/opt/gradle/gradle-6.4.1/bin/gradle ${options}"
}
