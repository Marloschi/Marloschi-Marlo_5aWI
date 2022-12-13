const tasks = [];

setHTMLTasks();
document.getElementById("addTask").addEventListener("click", function () {
  addTask();
});

function addTask() {
  let taskName = document.getElementById("taskName").value;
  let taskResponsible = document.getElementById("taskResponsible").value;
  let task = { name: taskName, isDone: "", responsible: taskResponsible };
  tasks.push(task);
  setHTMLTasks();
}

function setHTMLTasks() {
  document.getElementById("taskList").innerHTML = getHTMLTasks();
}

function getHTMLTasks() {
  let html = "";
  tasks.forEach((element) => {
    html +=
      "<li><input type='checkbox' " +
      element.isDone +
      "/>" +
      element.name +
      " " +
      element.responsible +
      "</li>";
  });
  return html;
}
