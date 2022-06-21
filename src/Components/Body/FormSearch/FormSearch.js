import InputSearch from "./InputSearch/InputSearch";
import ButtonSubmit from "./ButtonSubmit/ButtonSubmit";
function FormSearch() {
    return (
        <div className="content">
            <div className="search-wrapper">
                <InputSearch ></InputSearch>
                <ButtonSubmit></ButtonSubmit>
            </div>
        </div>
    )
}
export default FormSearch;