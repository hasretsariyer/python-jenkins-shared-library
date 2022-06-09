def sayHello() {
  final pythonContent = libraryResource('sharedlibrary/myFile.py')
  // There are definitely better ways to do this without having to write to the consumer's workspace
  writeFile(file: 'my_file.py', text: pythonContent)
  sh('chmod +x my_file.py && ./my_file.py')
}
