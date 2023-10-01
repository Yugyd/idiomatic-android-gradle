/Users/yugyd/Projects/IdiomaticAndroidGradle/app/src/main/res/values

stringsFile=./app/src/main/res/values/strings.xml

start="\<\/resources\>"
for i in $(seq $1 $2); do
  index=$i
  titles="$titles    \<string name\=\"sample${index}_title\"\>Sample${index}\<\/string\>\n"
done
new="$titles\n$start"

sed -i '' "s/$start/$new/g" $stringsFile
