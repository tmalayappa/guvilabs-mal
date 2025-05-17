const app = document.getElementById("app");


fetch("https://jsonplaceholder.typicode.com/users")
  .then((response) => response.json())
  .then((data) => {
    const table = `
      <table border="1" cellpadding="5" cellspacing="0">
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Website</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          ${data.map((user) => {
            return `
              <tr>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.website}</td>
                <td>
                  <button onclick="alert('User Name: ${user.name}')">View</button>
                </td>
              </tr>
            `;
          }).join("")}
        </tbody>
      </table>
    `;
    app.innerHTML = table;
  })


  // array method, 
  // string method,
  // object method,
  // window method,
  // document method,
  // event method,
  // fetch method,
  // promise method,
  // async/await method,
  // localStorage method,
  // sessionStorage method,
  // cookie method,
  // regex method,
  // math method,
  // date method,
  // json method,
  // dom



  // const arr = [1, 2, 3, 4, 5];
  const expected = arr.find(e=>i==3) // 3

  // List<string> arr = new List<string>();
    // arr.Add("1");
    // arr.Add("2");
    // arr.Add("3");
    // arr.Add("4");
// Integer exptec = arr.stream().filter((e) => e == 3).collect(); // 3

// const user = {name: "John", email: "john@mail.com"}

// Map<string, string> user = new Map<string, string>();
// user.set("name", "John");
// user.set("email", "john@mail.com");