# 

## Model
www.msaez.io/#/35618409/storming/lost-report

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- lostreport
- kt
- member
- 보험청구
- reportstatus


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- lostreport
```
 http :8088/lostReports id="id"userId="userId"userName="userName"phoneNumber="phoneNumber"plazaId="plazaId"managerId="managerId"callForwarded="callForwarded"forwardPhoneNumber="forwardPhoneNumber"lostDate="lostDate"Status = "LOST"
```
- kt
```
 http :8088/teleServices id="id"userId="userId"imei="IMEI"phoneNumber="phoneNumber"rentalImei="rental_IMEI"forwardingNumber="forwardingNumber"actionDate="actionDate"status="status"
```
- member
```
 http :8088/members id="id"name="name"phoneNumber="phoneNumber"openDate="openDate"email="email"status="status"
```
- 보험청구
```
 http :8088/보험청구 id="id"lostReportId="lostReportId"userId="userId"phoneNumber="phoneNumber"reviewMsg="reviewMsg"claimDate="claimDate"status="status"
```
- reportstatus
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```
