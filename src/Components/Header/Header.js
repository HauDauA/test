import Button from "./Button";
import Image from "./Image";
import { checkLoginContext } from "../../App"
import { useContext } from "react"
function Header(props) {
    const checkLogin = useContext(checkLoginContext);
    return (
        <div className="top-bar">
            <div className="bar-right">
                <div className="menu">
                    <a href="#">Gmail</a>
                    <a href="#">Images</a>
                </div>
                <a href="#" className="app-toggle">
                    <i className="fa fa-ellipsis-h" />
                </a>
                <a href="#" className="profile-trigger" onClick={props.onLogout}>
                    {checkLogin ? <Image /> : <Button />}
                </a>
            </div>
        </div>
    );
}
export default Header;