'''vim /opt/apache/conf/tomcat-user.xml'''

    <role rolename="admin-gui"/>
    <role rolename="manager-gui"/>
    <role rolename="manager-status"/>
    <role rolename="manager-script"/>
    <role rolename="manager-jmx"/>
    <user username="tomcat" password="redhat" roles="admin-gui,manager-gui,manager-status,
    manager-script,manager-jmx"/>


 '''vim /opt/apache-tomcat-8.5.51/webapps/manager/META-INF/context.xml'''
    
        <!--Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" / -->
