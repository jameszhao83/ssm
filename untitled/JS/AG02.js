var myapp = angular.module('myapp',[]);


myapp.controller('firstController',function($scope){

    $scope.date=new Date();
    setInterval(function(){

        $scope.date=new Date();

    },1)

    setInterval(function(){
        $scope.$apply(function(){

            $scope.date=new Date();
        })

    },1000)
})