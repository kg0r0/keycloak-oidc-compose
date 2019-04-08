#!/bin/bash

cat /etc/httpd/conf/httpd.conf

########################################################################################
#
# Start HTTPD 
#
########################################################################################

exec /usr/sbin/httpd -DFOREGROUND 

# For debug
#tailf /dev/null