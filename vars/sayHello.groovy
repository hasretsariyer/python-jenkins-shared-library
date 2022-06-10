def call() {
  final pythonContent = libraryResource('sharedlibrary/myFile.py')
  
  sh 'chmod +x myFile2.py && python3 myFile2.py'
  
  writeFile(file: 'my_file.py', text: pythonContent)
  sh 'chmod +x my_file.py && python3 my_file.py'
}
