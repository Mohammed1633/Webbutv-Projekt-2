document.forms[0].addEventListener("submit", e => {
	e.preventDefault();
  const input = new FormData(e.target);
  e.target.nextElementSibling.append(
  	Object.assign(document.createElement("li"), {
    	textContent: `${input.get("item")} - ${e.target.nextElementSibling.children.length + 1}`
    })
  )
})