# keycloak-oidc-compose
## RUN
```
$ docker-compose build
$ docker-compose up -d
```

## Usage

### Local
1. Add below in hosts file.
```
127.0.0.1 keycloak
```
2. Acccess to ``http://localhost/private`` .

3. Input user name and password.

## Info
### master realm
|user name  |password  |
|---|---|
|admin  |password  |

### demo realm
|user name  |password  |
|---|---|
|user  |password  |

## Note
In a real OAuth application, it's a terrible idea to display the access token like this since it's a secret value that the client is supposed to be protecting.  
In our demo, this helps us visualize what's happening, so we'll do this terrible security practice.

