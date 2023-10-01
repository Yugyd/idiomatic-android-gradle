generateCode() {
  featureIndex=$2

  codeDir="./app/src/main/java/com/yugyd/idiomatic/android/gradle/$1/sample$featureIndex"
  cp -r "./app/src/main/java/com/yugyd/idiomatic/android/gradle/$1/sample1" $codeDir

  for file in $codeDir/**.kt; do
    echo "Process new file: ${file##/}"

    newFile=${file/1/$featureIndex}
    mv $file $newFile
    echo "Rename file: $newFile"
  done

  for file in $codeDir/**.kt; do
    new="sample$featureIndex"
    sed -i '' "s/sample1/$new/g" $file

    newTwo="Sample$featureIndex"
    sed -i '' "s/Sample1/$newTwo/g" $file
  done
}

feature() {
  featureIndex=$1

  echo "Generate feature UI files: ${featureIndex}"
  generateCode ui ${featureIndex}

  echo "Generate feature domain files: ${featureIndex}"
  generateCode domain ${featureIndex}

  echo "Generate feature domain files: ${featureIndex}"
  generateCode data ${featureIndex}

  echo "Generate layout: ${featureIndex}"
  cp "./app/src/main/res/layout/fragment_sample1.xml" "./app/src/main/res/layout/fragment_sample$featureIndex.xml"
}

for ((i = $1; i < $2 + 1; i++)); do
  feature "${i}"

done
