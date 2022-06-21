import React, { createContext, useEffect, useState } from 'react';
import Header from "./Components/Header/Header";
import Footer from "./Components/Footer/Footer";
import './App.css'
import './App.scss'
import Body from './Components/Body/Body';


export const checkLoginContext = createContext();

function App() {
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    const loginHandler = (email, password) => {
        setIsLoggedIn(true);
        localStorage.setItem('userName', email)
    };
    const logoutHandler = () => {
        setIsLoggedIn(false);
        localStorage.clear();
    };
    useEffect(() => {
        const checkLogin = localStorage.getItem('userName');
        if (checkLogin) {
            setIsLoggedIn(true);
        }
    })
    return (
        <checkLoginContext.Provider value={isLoggedIn}>
            <Header onLogout={logoutHandler}></Header>
            <Body onLogin={loginHandler}></Body>
            <Footer></Footer>
        </checkLoginContext.Provider>
    );
}
export default App;
