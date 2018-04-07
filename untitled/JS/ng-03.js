var myapp = angular.module('myapp',[]);


myapp.controller('seController',function($scope,$http){
    $scope.date=new Date();
    setInterval(function(){
        $scope.date=new Date();
    },1)

    setInterval(function(){
        $scope.$apply(function(){
            $scope.date=new Date();
        })
    },1000)
    var i=0;
   $scope.car=null;


    $http.get('./JS/bbb.json').then(function success(data){
        console.log(data);
        $scope.car=data.data;
    }, function error(err) {

    })


    $scope.totalPrice= function () {
        var total=0;
        angular.forEach($scope.car,function(item){
            total+=item.quantity * item.price;
        })
        return total;
    }

    $scope.countItem=function(){
        var count=0;
        angular.forEach($scope.car,function(item){
            count+=parseInt(item.quantity);


        })
        return count;
    }

    $scope.removeOne=function(id){
    alert(id);
       var  index=-1;
        angular.forEach($scope.car,function(item,key){
            if(item.id == id){
                index=key;
            }
        })
        if(index !== -1){
            $scope.car.splice(index,1);//删除原始1个
        }
    }

    $scope.addItem=function(id){
        angular.forEach($scope.car,function(item,key){
            if(item.id == id){
                item.quantity=item.quantity+1;
            }
        })
    }


    $scope.removeItem=function(id){
        angular.forEach($scope.car,function(item,key){
            if(item.id == id ){
                if(item.quantity >1){
                    item.quantity=item.quantity-1;
                }else{
                    if(confirm("是否要删除该项")){
                        $scope.removeOne(id);
                    }
                }
            }
        })
    }


    $scope.$watch('car',function(newValue,oldValue){

        angular.forEach(newValue,function(item,key){
            if(item.quantity < 1){
                if(confirm('是否删除该商品')){
                    $scope.removeOne(item.id);
                }else{
                    item.quantity=oldValue[key].quantity;
                }
            }


        })
    },true);
})
