generateGraph() {
  feature=$1

  newFileName="sample${feature}_navigation.xml"
  newFile="./app/src/main/res/navigation/$newFileName"
  cp "./build-logic/scripts/templates/sample_navigation.xml.template" $newFile

  new="sample$feature"
  sed -i '' "s/sample1/$new/g" $newFile

  newTwo="Sample$feature"
  sed -i '' "s/Sample1/$newTwo/g" $newFile

  newGraphName="sample_${feature}_navigation"
  sed -i '' "s/mobile_navigation/$newGraphName/g" $newFile
}

includeGraphs() {
  feature=$1

  navigationFile=./app/src/main/res/navigation/mobile_navigation.xml

  start="\<\/navigation\>"
  for i in $(seq $1 $2); do
    index=$i
    graphs="$graphs    \<include app:graph=\"@navigation\/sample${index}_navigation\" \/\>\n"
  done
  new="$graphs\n$start"

  sed -i '' "s/$start/$new/g" $navigationFile
}

for i in $(seq $1 $2); do
  generateGraph $i
done

includeGraphs $1 $2
