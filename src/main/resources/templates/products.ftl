<#import "/spring.ftl" as spring>
<html>
<h1> Hello </h1>
<ul>
    <#list products as product>
        <li>${product}</li>
    </#list>
</ul>
<br>
<a href="/logout">Logout</a>
</html>