
function InputSearch(){
    return (
        <>
            <a href="#" className="search-logo">
                <img src="https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" />
            </a>
            <div className="search-bar">
                <div className="search-icon">
                    <i className="fa fa-search" />
                </div>
                <input type="text" />
                <div className="search-icon right">
                    <i className="fa fa-microphone" />
                </div>
            </div>
        </>
    )
}
export default InputSearch;