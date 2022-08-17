FROM openjdk:11
EXPOSE 8086
ADD target/partner-portal-product.jar partner-portal-product.jar
ENTRYPOINT["java","-jar","/partner-portal-product.jar"]