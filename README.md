# docker-backend 🐋

Isso mesmo, é um backend que retorna apenas uma mensagem armazenada num database postgreSQL. O objetivo era buildar e orquestrar containers com docker-compose

<br>

## Endpoints

| METHOD | ENDPOINT | TYPE | 
| -- | --- | --- |
| GET | `{urlBase}`/message | Array \<Message\> |
| GET | `{urlBase}`/message/:id | Message | 
<br>

## Database (ER)

Com SGBD PostegreSQL, foi feito o seguinte ER <br>

![image](https://github.com/Lebackrobot/docker-backend/assets/49316490/4da7f071-f66c-4869-9ae9-d490c4690098)
