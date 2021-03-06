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

```txt 
{
  getString
}
```

---

```txt 
{
	countPersons : Long
}
```

---

```txt 
{
	countBooks : Long
}
```

---

```txt 
{
  getGreetingsFirstName(firstName: "anantha")
}
```

---

```txt 
{
  getGreetingsFullName(firstName:"anantha raju", lastName:"c")
}
```

---

```txt 
{
  getGreetingsFullNameJSONrequest
  (
    fullName: { firstName: "Anantha Raju", lastName: "C" }
  )
}
```

---

```txt 
{
  findPersonById(id: 1) 
  {
    email
    name
  }
}
```

---

```txt 
{
  findPersonById(id: 1) 
  {
    id
    email
    name
    isAdult
  }
}
```

---

```txt 
{
  findPersonById(id: 1) 
  {
    email
    name
     books
    {
	  id
      title
    }
  }
}
```
---