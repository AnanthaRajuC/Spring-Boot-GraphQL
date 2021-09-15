## API

The API can be tested with any GraphQL client like [Altair GraphQL Client](https://altair.sirmuel.design/), [Postman](https://www.postman.com/) etc., or by using the GraphiQL UI avaialble after adding its dependencies in the pom.xml file

|                                          URL               | Method |         Remarks        |
|------------------------------------------------------------|--------|------------------------|
|`http://localhost:8080/graphiql`                            | POST   |graphiql                |
|`http://localhost:8080/graphql`                             | POST   |Altair GraphQL Client   |
|`http://localhost:8080/graphql`                             | POST   |Postman GraphQL Request |

<div style="text-align:center"><img src="images\graphiql.PNG" /></div>    

<div style="text-align:center"><img src="images\altair-graphql-client.PNG" /></div>

<div style="text-align:center"><img src="images\postman-graphql-request.PNG" /></div>

---

```json 
{
  getString
}
```

---

```json 
{
  getGreetingsFirstName(firstName: "anantha")
}
```

---

```json 
{
  getGreetingsFullName(firstName:"anantha raju", lastName:"c")
}
```

---

```json 
{
  getGreetingsFullNameJSONrequest
  (
    fullName: { firstName: "Anantha Raju", lastName: "C" }
  )
}
```

---

```json 
{
  findPersonById(id: 1) 
  {
    email
    name
  }
}
```

---

```json 
{
  findPersonById(id: 1) 
  {
    email
  }
}
```

---