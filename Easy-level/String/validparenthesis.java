for(Char c:s.toCharArray()){
            if(c=='}' && !s.isEmpty() && c=='{'){
                s.pop();
            }
            else if(c==']' && !s.isEmpty() && c=='[]'){
                s.pop();
            }
            else if(c==')' && !s.isEmpty() && c=='('){
                s.pop();
            }
            else {
                s.push(c);
            }
        }
        return s.isEmpty();