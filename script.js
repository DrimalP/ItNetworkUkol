// definování pole pro uložení objektů
let people = [];

// funkce pro přidání nového objektu do pole a aktualizaci tabulky
function addPerson() {
  // získání hodnot z vstupních polí
  let firstName = document.getElementById("firstName").value;
  let lastName = document.getElementById("lastName").value;
  let phone = document.getElementById("phone").value;
  let age = document.getElementById("age").value;

  // vytvoření nového objektu a uložení do pole
  let person = {
    firstName: firstName,
    lastName: lastName,
    phone: phone,
    age: age
  };
  people.push(person);

  // aktualizace tabulky
  updateTable();
}

// funkce pro aktualizaci tabulky
function updateTable() {
  // získání reference na tabulku
  let table = document.getElementById("peopleTable");

  // smazání obsahu tabulky
  table.innerHTML = "";

  // vytvoření nového řádku pro každý objekt v poli
  for (let i = 0; i < people.length; i++) {
    let row = table.insertRow(i);

    // vytvoření nových buněk pro každou vlastnost objektu
    let firstNameCell = row.insertCell(0);
    let lastNameCell = row.insertCell(1);
    let phoneCell = row.insertCell(2);
    let ageCell = row.insertCell(3);

    // nastavení hodnot buněk na hodnoty vlastností objektu
    firstNameCell.innerHTML = people[i].firstName;
    lastNameCell.innerHTML = people[i].lastName;
    phoneCell.innerHTML = people[i].phone;
    ageCell.innerHTML = people[i].age;
  }
}

