var myapp = angular.module('myapp',[]);


myapp.controller('seController',function($scope){
    $scope.date=new Date();
    setInterval(function(){
        $scope.date=new Date();
    },1)

    setInterval(function(){
        $scope.$apply(function(){
            $scope.date=new Date();
        })
    },1000)

   $scope.car=[{
       id:3100,
       name:'iphone7',
       price:2561,
       quantity:3
   },{
       id:3101,
       name:'iphone8',
       price:3233,
       quantity:3
   },{
       id:3102,
       name:'iphone8',
       price:342,
       quantity:3
   },{
       id:3103,
       name:'iphone10',
       price:555,
       quantity:3
   },{
       id:3104,
       name:'iphone11',
       price:234,
       quantity:3
   },{
       id:3105,
       name:'iphone12',
       price:231,
       quantity:3
   },{
       id:3106,
       name:'iphone13',
       price:343,
       quantity:3
   },{
       id:3107,
       name:'iphone14',
       price:32112,
       quantity:3
   },{
       id:3108,
       name:'iphone15',
       price:2561,
       quantity:3
   },{
       id:3109,
       name:'iphone16',
       price:3511,
       quantity:3
   }];


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
