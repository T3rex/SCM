console.log("script loaded")

setPageTheme(getThemeLocalStorge());
const changeThemeBtn = document.querySelector("#theme-change-btn");
changeThemeBtn.addEventListener("click",(theme)=>{
    toggleTheme()
})


function setPageTheme(theme){
    setThemeLocalStorge(theme)
    let prev_theme = theme==="light" ? "dark" : "light";
    document.querySelector("html").classList.remove(prev_theme);
    document.querySelector("html").classList.add(theme);
    const changeThemeBtn = document.querySelector("#theme-change-btn");
    changeThemeBtn.querySelector("span").textContent = theme==="light" ? "Dark" : "Light";
}

function toggleTheme(){
    let current_theme = getThemeLocalStorge();
    let new_theme = current_theme==="light" ? "dark" : "light";
    setPageTheme(new_theme);
}
function setThemeLocalStorge(theme){
    localStorage.setItem("theme",theme);
}

function getThemeLocalStorge(){
    let theme = localStorage.getItem("theme");
    return theme ? theme : light;
}