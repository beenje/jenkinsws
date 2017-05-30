package eu.inuits
class FileCompiler implements Serializable {
  def script
  def project
  FileCompiler(script, String project){
    this.script = script
    this.project = project
    this.script.echo("Compiling ${project}")
  }
  def analyze(String file) {
    this.script.echo("${project}/${file}")
    this.script.sh("cat ${file}")
  }
}
