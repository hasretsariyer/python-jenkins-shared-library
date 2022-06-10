def call() {
  final pythonContent = libraryResource('sharedlibrary/myFile.py')
  
  writeFile(file: 'my_file.py', text: pythonContent)
  sh 'chmod +x my_file.py && python3 my_file.py'
}
