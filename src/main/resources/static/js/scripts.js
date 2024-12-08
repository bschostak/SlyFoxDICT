function onClick(searchAllCheckBox) {
  let searchCheckBoxes = Array.from(document.getElementsByClassName("sc-gJwTLC")) //TODO: Learn "Array"

  searchCheckBoxes.forEach(searchCheckBox => {
    searchCheckBox.checked = searchAllCheckBox.checked;
  });
}