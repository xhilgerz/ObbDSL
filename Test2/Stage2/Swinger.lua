local Swinger = Instance.new("Part")
Swinger.Name = "Swinger"
Swinger.Size = Vector3.new(8, 1, 4)
Swinger.Name = "Swinger"
Swinger.Name = "Swinger"
Swinger.Parent = workspace
local SwingerScript = Instance.new("Script")
SwingerScript.Parent = Swinger
SwingerScript.Source = [[
local TweenService = game:GetService("TweenService")
local part = script.Parent
local startPos = part.Position
local distance = 10
local speed = 3
local tweenInfo = TweenInfo.new(distance / speed, Enum.EasingStyle.Linear, Enum.EasingDirection.Out, -1, true)
local tween = TweenService:Create(part, tweenInfo, {Position = startPos + Vector3.new(distance, 0, 0)})
tween:Play()
]]

