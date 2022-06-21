import FormSearch from "./FormSearch/FormSearch"
import Login from "./Login/login"
import { checkLoginContext } from "../../App"
import { useContext } from "react"

const Body = (props) => {
    const checkLogin = useContext(checkLoginContext);
    return (
        <>
            {checkLogin ? <FormSearch /> : <Login onLogin={props.onLogin} />}
        </>
    )
}
export default Body