import React, { useEffect, useState } from "react";


import styled from "styled-components";
import SearchResult from "./SearchResult";
import Join from "./Join";
import { BrowserRouter, Route, Routes, useParams } from "react-router-dom";
import CreateDocs from "./CreateDocs";
import axios from "axios";


const ArticleArea = styled.div`
    padding : 2vw;
`;

const Title = styled.h1 ``;

const HeadContent = styled.div``;






const Article = (props) => {
    const [title,setTitle] = useState({
        title : ""
    }); 
   

    // const getTitle = (curUrl) => {
    //     console.log(curUrl);
    //     let reversedUrl = curUrl.split("").reverse().join("");
    //     let result = "";
    //     for(let i = 0; i<reversedUrl.length; i++){
    //         if(reversedUrl.charAt(i) === '/'){
    //             console.log(reversedUrl.charAt(i));
    //             break;
    //         }
    //         else
    //             result += reversedUrl.charAt(i);
            
    //     }
    //     return result.split("").reverse().join("");
    // }

    // const [title,setTitle] = useState(getTitle(window.location.href));
    
    

    // useEffect(() => {
    //     axios.get(window.location.href).then((res) => {
    //        setData({
    //            title : res.data.title
    //        })     
    //     })
    // },[props.data])
    useEffect(() => {

   
    },[title]);

    



        
    return (

            <ArticleArea>
                    
                <Title>
                    {props.data.title}
                </Title>

                <HeadContent>        
                        <Routes>
                            <Route path="/join"  element={<Join/>} />
                            <Route path="/docs/search/:id" element={<SearchResult setTitle={setTitle} data={props.data}/>} />
                            <Route path="/docs/create" element={<CreateDocs/>} />
                            <Route path="/docs/notFound"  element={<Join/>} />
                        </Routes>
                </HeadContent>
            </ArticleArea>

    );
}


export default Article;