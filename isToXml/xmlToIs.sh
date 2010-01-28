print_jars() {
    echo -n $1
    shift
    for i; do
        echo -n :$i
    done
}

groovy -cp `print_jars lib/*.jar`  xmlToIs.groovy $1 $1.blob
