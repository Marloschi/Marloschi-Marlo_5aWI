document.getElementById("generate").addEventListener("click", () => {
        generatePassword();
    });

function generatePassword() {
  let chars = "qwertzuiopüasdfghjklöäyxcvbnmQWERTZUIOPÜASDFGHJKLÖÄYXCVBNM1234567890!§$%&/()=?";
  let lengthOfPassword = 12;
  let randomPassword = "";
  for (var i = 0; i <= lengthOfPassword; i++) {
    var randomNumber = Math.floor(Math.random() * chars.length);
    randomPassword += chars.substring(randomNumber, randomNumber + 1);
  }

  document.getElementById("password").value = randomPassword;
}
