import React from 'react';
import styled from 'styled-components';



const OutlineArea = styled.div`

    display: inline-box;
    border: 1px solid;
    margin-top :5vh;
    padding:2vw;

`;

const ContentArea = styled.div`
    margin-top:5vh;
`;

const OutlineWord = styled.h2`
    margin-top :5vh;
    margin-bottom: 5vh;
`

const Paragraph = styled.div`
    display : inline-box;
`;

const SearchResult = () => {
    return (
    <div>

        <OutlineArea>
            <ul>
                <li>1sdfsdf</li>
                <li>2sdddf</li>
                <li>3sdfsdf</li>
            </ul>
        </OutlineArea>

        <ContentArea>
            
             <OutlineWord>
                목차
            </OutlineWord>

            <Paragraph>
                내용
            </Paragraph>

        </ContentArea>

    </div>

    );
}

export default SearchResult;