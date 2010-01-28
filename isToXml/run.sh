print_jars() {
    echo -n $1
    shift
    for i; do
        echo -n :$i
    done
}

groovy -cp `print_jars lib/*.jar`  isToXml.groovy $1 $2 $2.xml
