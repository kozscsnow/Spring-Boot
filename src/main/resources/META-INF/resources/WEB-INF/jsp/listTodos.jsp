
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <html>

       <head>

           <title>
               List Todos
           </title>
       </head>


           <body>
               <h1> List Todos</h1>
               ${todos}
               <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Description</th>
                            <th>Target Date</th>
                            <th>Status</th>
                        </tr>
                    </thead>

                    <tbody>
                            <c:forEach items="${todos}" var="todo">
                                <tr>
                                    <td>${todo.id}</td>
                                    <td>${todo.description}</td>
                                    <td>${todo.targetDate}</td>
                                    <td>${todo.done}</td>
                                </tr>
                            </c:forEach>
                    </tbody>
               </table>
           </body>
       </html>