# Parcial 3 - DevOps

## Integrantes
- Valentina Santana
- Nicol Gonzalez

## Descripcion

Este proyecto corresponde al Parcial 3 de DevOps. Consiste en el despliegue y monitoreo de un microservicio de Eventos utilizando herramientas de observabilidad y servicios de AWS.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Docker
- Docker Compose
- Prometheus
- Grafana
- Loki
- Promtail
- GitHub Actions
- Amazon ECS
- Amazon ECR
- Amazon CloudWatch

## Estructura del proyecto

```
Parcial-3-Devops/
│
├── Evento/
├── Prometheus/
├── promtail/
├── documentacion/
├── logs/
├── docker-compose.yml
└── README.md
```

## Ejecución local

1. Clonar el repositorio.

```bash
git clone https://github.com/valeFSG/Parcial-3-Devops.git
```

2. Iniciar los contenedores.

```bash
docker compose up -d
```

3. Acceder a los servicios.

- Microservicio Evento:
  http://localhost:8081

- Actuator:
  http://localhost:8081/actuator

- Prometheus:
  http://localhost:9090

- Grafana:
  http://localhost:3000

## Observabilidad

El proyecto incluye:

- Metricas con Spring Boot Actuator y Micrometer.
- Monitoreo con Prometheus.
- Dashboards en Grafana.
- Centralización de logs con Loki y Promtail.
- Logs estructurados en formato JSON.

## Despliegue en AWS

El microservicio se despliega mediante GitHub Actions hacia:

- Amazon ECR
- Amazon ECS

Además, se utilizan:

- Amazon CloudWatch Metrics
- Amazon CloudWatch Logs

## Automatización

El repositorio incorpora un flujo CI/CD con GitHub Actions que:

- Compila el proyecto.
- Construye la imagen Docker.
- Publica la imagen en Amazon ECR.
- Actualiza la Task Definition.
- Despliega automáticamente el servicio en Amazon ECS.

## Repositorio

https://github.com/valeFSG/Parcial-3-Devops