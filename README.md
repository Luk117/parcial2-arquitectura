# parcial2-arquitectura
Parcial Diseño y Arquitectura de software

#Crear contenedor e imagen de docker 

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=clave -e MYSQL_DATABASE=yms --name mysqlserver mysql

Debe asegurarse que el puerto no este en uso, si tiene instalado MYSQL debe detener el servicio y crear el contenedor.
