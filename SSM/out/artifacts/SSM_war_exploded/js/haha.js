$(document).ready(function () {
    var isFirstMenu;

    var menulist ={"extend":{"children":[{"id":"1","text":"检修管理","children":[{"id":"66","text":"检修管理","jsfunction":"recondition","children":[],"parentId":"1"}],"parentId":"1"},{"id":"12","text":"巡检管理","jsfunction":"recondition2","children":[],"parentId":"1"},{"id":"3","text":"监护管理","jsfunction":"recondition1","children":[],"parentId":"1"}]}};
    $(window).load(function(){
        var showlist = $("<ul class=\"sidebar-menu\"></ul>");
        $("<li class=\"header\">请选择</li>").appendTo(showlist);
        isFirstMenu=menulist.extend.children.length;
        showall(menulist.extend.children, showlist);
        $("#div_menu").append(showlist);

        $("#recondition").click(function() {
           alert("recondition");
        });

        $("#recondition2").click(function() {
           alert("recondition2");
        });
        $("#recondition1").click(function() {
           alert("recondition1");
        });
    });






     function showall(menu_list, parent) {
        for (var menu in menu_list) {
            if (menu_list[menu].children.length > 0) {
                var li = $("<li></li>");
                if(isFirstMenu==0){
                    li = $("<li></li>");
                }else{
                    li = $("<li class=\"treeview\"></li>");
                    isFirstMenu=isFirstMenu-1;
                }
                $(li).append("<a href=\""+menu_list[menu].jsfunction+"()\"><span>"+menu_list[menu].text+"</span></a>");
                var nextParent=$("<ul class=\"treeview-menu\"></ul>");
                $(nextParent).appendTo(li);
                $(li).appendTo(parent);
                showall(menu_list[menu].children, nextParent);

            }
            else {

                $("<li><a id=\""+menu_list[menu].jsfunction+"\">"
                    +menu_list[menu].text
                    +"</a></li>").appendTo(parent);
            }
        }
    }



});