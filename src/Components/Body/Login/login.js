import { useState } from "react";
import { useForm } from "react-hook-form";
const Login = (props) => {
    const {register, handleSubmit, formState : {errors}} = useForm();
    const submitForm = (event) => {
        props.onLogin(event.email, event.password);
    }
    return (
        <div className="content">
            <div className="search-wrapper">
                <form onSubmit={handleSubmit(submitForm)}>
                    <div className="form-field">
                        <input 
                        type="email" 
                        placeholder="Email"
                         name="email" 
                         {...register("email",{required : true, pattern: /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/, minLength:6})} 
                         />
                    </div>
                    <div className="error">
                    {errors.email?.type === 'required' && "Email is required"}
                    {errors.email?.type === 'pattern' && "Email is invalid"}
                    {errors.email?.type === 'minLength' && "Length Email more than 5"}
                    </div>
                    <div className="form-field">
                        <input 
                        type="password" 
                        placeholder="Password"  
                        name="password" 
                        { ...register("password",{required : true, minLength : 6})} 
                        />
                    </div>
                    <div className="error">
                    {errors.password?.type === 'required' && "Password is required"}
                    {errors.password?.type === 'minLength' && "Length password more than 5"}
                    </div>
                    <div className="form-field">
                        <button className="btn" type="submit">Log in</button>
                    </div>
                </form >
            </div>
        </div>
    )
}
export default Login;