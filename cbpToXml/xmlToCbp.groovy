import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.ode.bpel.o.Serializer;

xs = new XStream()
xStream = new XStream(new DomDriver());
v = xStream.fromXML(new FileInputStream(args[0]));

s = new Serializer(System.currentTimeMillis())
s.writeOProcess(v, new FileOutputStream(args[1]));


