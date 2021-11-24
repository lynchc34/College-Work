#Data set read in
hfData <- read.csv("hfd_sub.csv")

#PCA
#unstandardised
#hfPC <- prcomp(hfData[, 1:4])

#standardised
#hfPC <- eigen(cor(hfData[, 1:4]))
#hfPC <- prcomp(hfData[, 1:4], scale=TRUE)

#print(hfPC)
#summary(hfPC)
#PC Line Plot standardised
#plot(hfPC, main = "Healthy Flow Data", type = "lines")

#Project data onto PC's
#predhf <- predict(hfPC)
#head(predhf, n=4)

#visual graph plot of the 4dimensions of variables
#pairs(hfData[, 1:4], col = hfData[, 5])

#Hierarchical Clustering
#Construction of matrix
hfCleanData <- as.data.frame(scale(hfData))
summary(hfCleanData)
clust1 <- dist(hfCleanData, method = 'euclidean')
hfClustPlot1 <- hclust(clust1, method = 'complete')
clust2 <- dist(hfCleanData, method = 'maximum' )
hfClustPlot2 <- hclust(clust2, method = 'complete')

plot(hfClustPlot1)
abline(h = 3.047464, col = 'red')
#rect.hclust(hfClustPlot, k = 4, border = 2.6)

#Coloured version
#install.packages('dendextend', dependencies = TRUE)
#suppressPackageStartupMessages(library(dendextend))
#avgHfClust <- as.dendrogram(hfClustPlot)
#avgColHf <- color_branches(avgHfClust, h = 4)
#plot(avgColHf)

#to get standard dev for abline calc
#head(hfClustPlot$height)

#Interpret of clusters
#hfLabels <- cutree(hfClustPlot1, h = 3.04746)
#palette(rainbow(5))
#plot(hfData[,1], hfData[,5], col = hfLabels)
#pairs(hfData, col = hfLabels)

#RandIndex
#install.packages("flexclust")
#library("flexclust")
#Cells <- cutree(hfClustPlot1, k = 4)
#GateVariable <- cutree(hfClustPlot2, k = 4)
#table(Cells, GateVariable)
#RandIndex
#randIndex(Cells, GateVariable, correct = FALSE)
#randIndex(Cells, GateVariable)

#KNN
#install.packages("class")
#library("class")
#install.packages("MASS")
#library("MASS")
#sim <- rbind()

#plot(hfData[,-1], col = as.factor(hfData[,1]))
hfTrain <- hfData[c(1:40, 51:90), ]
hfTest <- hfData[c(41:50, 91:100),]
hfL <- lda(hfTrain[, c(3, 4)], grouping = hfTrain[,3])

lsol_cv <- lda(hfData[,c(2,3)], grouping = hfData[, 1], CV = TRUE)

hfQ <- qda(hfTrain[, c(2, 3)], grouping = hfTrain[,1])