FROM mysql:8.0

#设置免密登录
ENV MYSQL_ALLOW_EMPTY_PASSWORD yes

#将所需文件放到容器中
COPY setup.sh /mysql/setup.sh
COPY schema.sql /mysql/schema.sql
COPY privileges.sql /mysql/privileges.sql
COPY my.cnf /etc/mysql/conf.d/mysqlutf8.cnf

#设置容器启动时执行的命令
CMD ["bash", "/mysql/setup.sh"]